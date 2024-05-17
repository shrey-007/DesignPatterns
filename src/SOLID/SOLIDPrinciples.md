## SOLID PRINCIPLES

### 1) Single Resposibility-:
Whatever classes you create , they should have a single responsibility. And that responsibility should only be followed by that class only.

### 2) OPEN CLOSED-:
Any class or any interface that you create should not be open for modifications. Means you should not modify the existing class, for adding extra functionality you should create a new class that extend that class and add whatever you want.

### 3) Liskov Substitution-:
Whenever you are creating a parent child relationship , then both the class should be interchangeable and substitutable. Means whenever I pass object of parent or object of child , both should work. 

### 4) Interface Segregation-:
We should create interface in such a way that those interfaces should have a proper methods that needs to be implemented. We should not create interfaces having 100 of methods but a client does not require all methods to be implemented. We should not force the client to implement those methods which are not even important to them. It will segregate the interface in such a way that , whatever the interface is implemented by client, all those methods should be relevant to that interface.

### 5) Dependency Inversion-:
Higher level modules should not be dependent on low level modules. It is means we should not create required objects directly using new keyword , instead we should take them from somewhere else to use. Spring uses AbstractBeanFactory to create the beans.   



