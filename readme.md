#What does dagger do?
1. Dagger is dependency injector framework which is based on the concept of DI(Depenency Inversion principle)
2. Benefits of using dagger is we can have reusable,replaceable and decoupled  component.
3. One of the principles in programming is 
`We should have less coupling between component so that even if we want to change one component,we don’t need change the another component`


# What is DI?
As explained earlier DI is Dependency Inversion Principle which states that "Higher level component should not be directly dependent on lower-level component" .  In simple language,two components of the application should have less coupling,so that we can reuse & replace any of them individually without affecting another component.

# How is dagger implemented?
It will be better explained by giving the sample example.
Project is using dagger2 for creating dependency injector. Whole idea is to use <b>MessengerModule</b> as a dependency for the application.

1. App uses the ApplicationModule which in turn uses the <b>MessengerModule</b> by passing the context to it.
2. MessengerComponent is an interface between "Activity" & "Module"
3. Activity will use MessengerModule injected by Dagger to display message to user. In similar way we can add different techniques to display messages to user inside MessengerModule.





