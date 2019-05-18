<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>HHHHHHHHHHHHHHHHHHHh</title>
    </head>
    <body>
        <p>I love black metal! \m/</p>
        <p>
            <% 
            String attribut = (String) request.getAttribute("message");
            out.println( attribut );
            String param = (String) request.getAttribute("nom");
            out.println( param );
            %>
        </p>
    </body>
</html>