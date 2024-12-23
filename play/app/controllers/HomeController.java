package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result showForm() {
        return ok(views.html.register.render());
    }

    public Result register(Http.Request request) {
        String username = request.body().asFormUrlEncoded().get("username")[0];
        String password = request.body().asFormUrlEncoded().get("password")[0];

        // Здесь можно добавить логику сохранения пользователя
        return ok("User registered: " + username);
    }

}
