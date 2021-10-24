# FlowSample

This sample demonstrates use of Flow, StateFlow & how we can test Flow.

In Kotlin, Coroutine is just the scheduler part of RxJava but now with Flow APIs coming along side it, it can be alternative to RxJava in Android.

Flow API in Kotlin is a better way to handle the stream of data asynchronously that executes sequentially.

So, in RxJava, Observables type is an example of a structure that represents a stream of items. Its body does not get executed until it is subscribed to by a subscriber. and once it is subscribed, subscriber starts getting the data items emitted. Similarly, Flow works on the same condition where the code inside a flow builder does not run until the flow is collected.

## Add the following in the app's build.gradle,

```groovy
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
testImplementation 'org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.1'
testImplementation "io.mockk:mockk:1.12.0"
testImplementation 'app.cash.turbine:turbine:0.6.1
```
