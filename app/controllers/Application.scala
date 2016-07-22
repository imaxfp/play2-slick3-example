package controllers

import play.api._
import play.api.mvc._

/**
  * @author Maxim.
  */
class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}
