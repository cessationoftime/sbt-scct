#### This is a sbt 0.11.x plugin for [scct](http://mtkopone.github.com/scct/) the scala code coverage tool.

scct ist auto-installed depending on the scalaVersion of the project.

#### Commands:

* coverage:compile
* coverage:test
* coverage:doc

coverage:test and coverage:doc do the same, so that if you run coverage:package-doc, you get your coverage report packaged.

docDirectory is reused for the coverage report directory

#### Compiling from Source

1. retrive the sources from github:

	git clone git@github.com:dvc94ch/sbt-scct.git

2. publish plugin:

	cd sbt-scct
	sbt publish-local

3. add plugin dependency in .sbt/project/plugins.sbt:

        addSbtPlugin("ch.craven" %% "sbt-scct" % "0.2")	
	
4. to enable ScctPlugin in your project, add the following line to your build.sbt

	seq(ScctPlugin.scctSettings: _*)
