#### Guicy-scala is small project build upon Maven (and SBT!), Scala 2.9.0-1 and Google Guice 3.0

If you want to start fast with some exercises using Google Guice with Scala, check class *CoreTests*.
All you need to do is to extend it :-)  
Everything is tested with help of Specs2 library.

I covered few examples of Guice here:

* definition and installation of modules
* binding through module configuration and annotation @Provides
* auto creation of Factory class through @Assisted inject
* @Singleton annotation
* @Names annotation

Still to cover:

* define and use own annotation
* define custom scope
* intercept method