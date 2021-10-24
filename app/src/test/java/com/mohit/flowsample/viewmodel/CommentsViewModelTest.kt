package com.mohit.flowsample.viewmodel

import com.mohit.flowsample.CoroutineTestRule
import com.mohit.flowsample.network.ApiService
import com.mohit.flowsample.repository.CommentsRepository
import io.mockk.*
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CommentsViewModelTest  {

    private lateinit var viewModel: CommentsViewModel

    @get:Rule
    var coroutinesTestRule = CoroutineTestRule()

    @Before
    fun setUp() {
        viewModel = spyk(CommentsViewModel())
    }

    @Test
    fun testGetNewComment() {
        mockkClass(CommentsRepository::class)
        val repo = spyk(CommentsRepository(mockk<ApiService>(), coroutinesTestRule.testDispatcher))

        coEvery { repo.getComment(10) } returns flowOf(mockk())

        coroutinesTestRule.testDispatcher.runBlockingTest { viewModel.getNewComment(10) }

        coVerify { viewModel.getNewComment(10) }
    }

}