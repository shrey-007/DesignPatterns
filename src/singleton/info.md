1) There are some cases in which we require only one object of a class Ex-: A class which connects with a database, so we need only one instance of that object because if we create another instance of that object then two connections are established between you application and software. But there is only lisence, and from one license we can create only one connection so DB provider will impose a penalty on us.
2) All properties, methods should be private and static.
3) Sequence to read-: Lazy &rarr; Eager &rarr; MultiThreaded &rarr; Serializable &rarr; Enum
