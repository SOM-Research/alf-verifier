

# Showing Alf-verifier views #

**Alf-verifier** plug-in is designed to work as an Eclipse view. Therefore, the first thing to be done is telling Eclipse to show the corresponding views.

To show the **Alf-verifier** views, go to: _Window_ > _Show View_ > _Other_ and select under _SeverificationTreeView_ both _Alf verifier – input_ and _Alf verifier - feedback_ views.

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig1.SelectingAlf-verifierViews.PNG

Check that the two views are available in the views section:

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig2.Alf-verifierViews.PNG

# Creating a UML Executable Model #

Alf-verifier takes as input a UML Executable Model composed by:
  * Structural Model: A UML Class Diagram
  * Behavioural Model: A set of operations described in Alf Action Language.

## Creating a UML Class Diagram ##

In order to create the UML Class Diagram, we recommend using the UML2Tools plug-in, an Eclipse plug-in for manipulating UML models.

To create a new UML Class Diagram using UML2Tools plug-in, go to: _File_ > _New_ > _Other_ and select under _UML2.1 Diagrams_ the _Class Diagram_ option.

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig3.CreatingUMLClassDiagram.PNG

Now, we can create a complete UML Class Diagram using the Palette of UML elements. Note that we can also attach OCL integrity constraints to our class diagram.

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig4.ExampleUMLClassDiagram.PNG

As a result, we obtain two files:
  * A _.uml_ file: Containing information about the class diagram.
  * A _.umlclass_ file: Containing information on the graphical representation of the class diagram.

## Creating Alf operations ##
The file containing the Alf operations can be created using Eclipse text files or other any editing tool. It must be saved with extension _.alf_.

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig5.ExampleAlfOperationsFile.PNG

To see the rules of Alf Action language, goes <a href='http://www.omg.org/spec/ALF/'>here</a>.

# Importing _.uml_ and _.alf_ files to Alf-verifier #

Our method takes as input the _.uml_ and the _.alf_ files.

In order to import these files, you can go to the _Alf verifier – input_ tab and click on _UML class diagram_ and _Alf operations_ button respectively.

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig6.ImportingExecutableModel.PNG

Once two files has been imported, you can choose which of the operations should be verifier: in order to do this a select combo is available with all the operations contained in _.alf_ operations file plus an “all” option, which will verify all the operations included in the file.

Then, you can select the property you want to verify (weak executability or strong executability) by clicking at the corresponding button. After that, the results of the verification will appear in _Alf-verifier Feedback_ tab.

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig7.SelectingOperations.PNG

# Feedback #

Once the verification ends, the _Alf verifier – Feedback_ tab shows the result of the verification:

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig8.Feedback.PNG

As can be observed, the feedback provided by **Alf-verifier** consists of a tree with these levels:

  * Level 1: Operation: Show the name of the operation being verified.

  * Level 2: Execution path: Show the i-th execution path of the operation.

  * Level 3: Sentence: Show the j-th sentence of the i-th execution path.

  * Level 4: Violated constraints: Show the constraints the j-th sentence may violate.

  * Level 5: Solving proposals:

  * Level 5.1: Queries: Only when it is necessary, show the (basic) queries that the user may manually resolve to help during the verification process.

  * Level 5.2: Code: Show one or several alternative code blocks to be added to the operation in order to ensure the violated constraints will not be violated.

# Examle #

See a complete example <a href='http://code.google.com/a/eclipselabs.org/p/alf-verifier/wiki/Example?ts=1331219359&updated=Example'>here</a>.





