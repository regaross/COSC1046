c=======================================================================
c
c               \\\\\\\\\\ COSC 1046 in FORTRAN 77 //////////
c                      ////////// Question 1 \\\\\\\\\\
c
c=======================================================================
      program question1

c     Variable declarations
      
      character*5 name
      integer gradyear
      real salary

c     Variable initialization

      data name, gradyear, salary / 'Regan' , 2022, 120000.0 /

c     Print Statements

      print *, 'My name is ', name
      print *, 'I graduated in ', gradyear
      print *, 'I hope to make $', salary, ' this year.'

      end