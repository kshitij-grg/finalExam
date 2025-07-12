### Question 1
Below is the differences between the two thread pools and how they handle their tasks.
#### newCachedThreadPool():
If the staffList contains 2, 20 or 200 names, `newCachedThreadPool()` will depending on the number of names, make new threads and even reuse the idle ones. And once the task is completed, the idle threads return back to the pool.
#### newFixedThreadPool(numThreads)
This thread does not depend on the number of items that the list may have, it rather depends on the argument that is passed onto it i.e. in our question, the variable `numThreads` is passed which has the value of 10. So it means that even thought, the staffList may contain 2, 20 or 200 names, this thread will work with only the provided number which is 10 and the remaining numbers will queue up onto it.

### Question 2
I would choose `newCachedThreadPool()` for the given scenario in Question 2. The Question is asking us that even though most alert events only have few staff members, there may be some rare cases where I have to send the alerts to hundreds at once. The Question also adds up that the events are independent and short-lived task and I have to maintain network latency.

This means that using `newCachedThreadPool()` allows us to send hundred of requests at the same time without any workload and latency. Because if I use `newFixedThreadPool()` then it will only work with its provided threads and other requests will have to queue up which is not the optimal solution for our given scenario.

### Question 4

Some of the risks of using cached thread pool on a server with limited CPU and memory usage are:
 - Hampering System Stability:
   - Since cached thread pool opens new thread depending upon the task, it will be heavy on the server which have limited CPU.
 - Resource Management:
   - Cached thread pool opens up new thread for the new task, so it means it will require more memory usage for its new threads but if we have limited memory usage then it will not be managed properly and will hamper our system.