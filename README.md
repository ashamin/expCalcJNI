Expression calculator for JNI presentation
==========================================

<p>This project presents a possibility of calling C functions from Java code using Java Native Interface(JNI).

<p>Parser of expressions was generated from grammar (you can find it in resource/ folder) with ANTLR v3.4.
These auto generated classes you can find in parser/ folder.

<p>C implementation of native java methods you can find in C/ folder. Shared library from lib/ was compiled 
with linking headers from $JAVA_HOME/include/
