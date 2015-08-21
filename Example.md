

# UML Class Diagram #

Take as example the following UML Class Diagram, meant to partially model the menus offered by a restaurant chain:

http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/Example.Fig1.ClassDiagram.PNG

# Alf operation #

Take also the following Alf operation, which classifies an existing menu as an special menu:

`activity classifyAsSpecialMenu(in _discount:Real){` <br>
<code>	if ( _discount &gt;= 10 ){</code> <br>
<code>		classify self to SpecialMenu;</code> <br>
<code>		self.discount = _discount;</code> <br>
<code>	}</code> <br>
<code>}</code>

<h1>Verifying the operation</h1>

When we verify the strong executability the operation <i>classifyAsSpecialMenu</i>, we obtain the following feedback:<br>
<br>
<a href='http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig8.Feedback.PNG'>http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/UserGuide.Fig8.Feedback.PNG</a>

As the above feedback shows, operation <i>classifyAsSpecialMenu</i> is not strongly executable, since it may violate the constraint <i>AtMost3SpecialMenus</i> (when the system state already contains three special menus).<br>
<br>
<h1>Repairing the operation</h1>

The feedback tab proposes three alternatives to avoid the above violation:<br>
<br>
<ul><li>Alternative 1: Add a guard ensuring there are not three special menus.<br>
</li><li>Alternative 2: Destroy an existing special menu.<br>
</li><li>Alternative 3: Reclassifies from SpecialMenu an existing special menu.</li></ul>

In order to correct the operation, we add the first alternative to our code:<br>
<br>
<code>activity classifyAsSpecialMenu(in _discount:Real){</code> <br>
<code>	if ( _discount &gt;= 10 and SpecialMenu.allInstances()-&gt;size&lt;3 ){</code> <br>
<code>		classify self to SpecialMenu;</code> <br>
<code>		self.discount = _discount;</code><br>
<code>	}</code> <br>
<code>}</code> <br>

If we verify again the corrected operation, we obtain the following feedback:<br>
<br>
<a href='http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/Example.Fig2.Feedback.PNG'>http://svn.codespot.com/a/eclipselabs.org/alf-verifier/wiki/Example.Fig2.Feedback.PNG</a>

As can be observed, <i>classifyAsSpecialMenu</i> is now strongly executable.