### Why enum over traditional singleton class
In Traditional Singleton class, we have to check if our instance variable is null or not. Depending on its value, we had to assign a new instance of the Singleton class if its null and the previously declared one if it is not null.

Making Singleton class in this way would make our class vulnerable to the multi thread requests. For example, If a developer is using multiple threads to access that class, they would indeed have to go through the condition of whether the instance variable is null or not and at that time, since the request is from multi threads, it may create new instances of the Singleton class which will result in inconsistent data.

But here in enum, we are declaring only one value and that value is always final so even though multiple developers try to use this class, they will only get one instance of that particular class every single time.