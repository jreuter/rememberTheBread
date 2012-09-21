// @SOURCE:/home/jarrod/code/rememberTheBread/conf/routes
// @HASH:368901b3f3e7c05f65dd864aa78f3f7ba4533af6
// @DATE:Tue Sep 18 22:54:46 EDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseListsController {
    


 
// @LINE:9
def read() = {
   Call("GET", "/lists")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseListsController {
    


 
// @LINE:9
def read = JavascriptReverseRoute(
   "controllers.ListsController.read",
   """
      function() {
      return _wA({method:"GET", url:"/lists"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:9
class ReverseListsController {
    


 
// @LINE:9
def read() = new play.api.mvc.HandlerRef(
   controllers.ListsController.read(), HandlerDef(this, "controllers.ListsController", "read", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                