(make-package :tom)
(make-package :dick)
(make-package :harry)
(in-package tom)
(defun hello () 
   (write-line " Tom say hello")
)

(hello)
(in-package dick)
(defun hello () 
   (write-line "Dick say hello")
)

(hello)
(in-package harry)
(defun hello () 
   (write-line "Harry say hello")
)

(hello)
(in-package tom)
(hello)
(in-package dick)
(hello)
(in-package harry)
(hello)