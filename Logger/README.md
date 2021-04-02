Tasks to answer in your own README.md that you submit on Canvas:

1.  See logger.log, why is it different from the log to console?
It allows us to report error and warning messages, and information like runtime statistics so that the messages can later be retrieved and analyzed.
1.  Where does this line come from? FINER org.junit.jupiter.engine.execution.ConditionEvaluator logResult Evaluation of condition [org.junit.jupiter.engine.extension.DisabledCondition] resulted in: ConditionEvaluationResult [enabled = true, reason = '@Disabled is not present']
It is an exception that results from expecting a disabled evaluation result but not receiving one
1.  What does Assertions.assertThrows do?
it asserts that when a supplied executable block, a particular exception is thrown. If no exception is thrown, the method fails.
1.  See TimerException and there are 3 questions
    1.  What is serialVersionUID and why do we need it? (please read on Internet)
	SerialVersionUID is used to ensure that during deserialization the same class (that was used during serialize process) is loaded
    2.  Why do we need to override constructors?
	To enable the option for handling different attribute types being passed into parameters
    3.  Why we did not override other Exception methods?	
	We only need to override Exception methods applicable to the content of the program
1.  The Timer.java has a static block static {}, what does it do? (determine when called by debugger)
1.  What is README.md file format how is it related to bitbucket? (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)
A README is a text file that introduces and explains a project. Bitbucket uses CodeMirror to apply syntax highlighting to the README and its pull request descriptions.
1.  Why is the test failing? what do we need to change in Timer? (fix that all tests pass and describe the issue)
Expecting a NullPointerException rather than a TimerException, so replacing the two will solve the test issue
1.  What is the actual issue here, what is the sequence of Exceptions and handlers (debug)
1.  Make a printScreen of your eclipse JUnit5 plugin run (JUnit window at the bottom panel) 
1.  Make a printScreen of your eclipse Maven test run, with console
1.  What category of Exceptions is TimerException and what is NullPointerException
A NullPointerException is a runtime exception thrown when the application attemots to use an object reference which has null value.
A Timer Exception is also a runtime exception used to communicate failure of a timer object.
1.  Push the updated/fixed source code to your own repository.
