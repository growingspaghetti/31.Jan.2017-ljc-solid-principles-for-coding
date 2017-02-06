# 31.Jan.2017-ljc-solid-principles-for-coding

https://www.meetup.com/Londonjavacommunity/events/236791103/

Single responsibility
---------------------

Parser - MeanCaluculater


Open/Close
----------
```
	abstract Parser [protected abstract split(), public parse<Double>(String){string.split()}]
		CsvParser abstract Parser
			@Override split(String) <- JSON, CSV, XML
```

```
getParser
 switch case XML
        case CSV..
        
 --> dependency injection container/factory
 -> registration: Map<String, Parser> .. parser doesn't have state
```

Liscov
------
```
rectangle, square <-shape
getParser()
```


Interface Segregation
---------------------

```
Interface getting bigger..
Domain specific inferface
```

```
inferface AuthorizationService {
	1
	2
	3
	a
	b
	c
}
->
interface EntitlementsChecker  {1 2 3}
interface EntitlementsModifier {a b c}
```

 - cohisiveness
   - forming a united whole


Dependency Inversion
--------------------

 - Specific implementation shouldn't affect abstruction.
 
```
 Mocking - database <-- --> file
```

Calculator
=======
```
AverageCalcu {
	const(interface iprocesser, i iparser, i iinput, i ioutput)
	
	run() {
		output.write()
	}
}
```

STUPID
======
 
 - Singleton.. good usages: Const objects, immutable [state, global access]
 - Tight coupling
 - Untestability
 - Premature optimisation
 - Indescriptive naming
 - Duplication
 
 
Cohesion and Coupling
======================
https://accu.org/index.php/journals/1957

execise: tinyurl.com/stupidcalc
