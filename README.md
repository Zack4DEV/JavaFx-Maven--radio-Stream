
# RadioApp

![RadioApp](/src/main/resources/static/Images/MarkDown.png)

# ====================================

## Project In General

Name: RadioApp.<br/>
Description: Moroccan Radio Stations JavaFx-App.<br/>
@Version: 1.0.0-SNAPSHOT.<br/>
@Author: Zack4DEV.<br/>

# ====================================

## Project In Technical

This project uses Maven, JavaFX Java Framework.

If you want to learn more about JavaFX, please visit its website: <https://openjfx.io/> .

# ------------------------------------------

#### Running the application

You can run your application with maven javafx plugin using:

```shell script

mvn clean javafx:run
```

Or with modules javafx-fxml,javafx-controls,javafx-media added using:

```shell script
mvn clean install -f kit
java "
--module-path lib/
--add-modules=javafx-controls,javafx-fxml,javafx-media \
--add-opens=javafx-fxml/javafx.fxml=ALL-UNNAMED \
com.oracle.javafx.scenebuilder.app.SceneBuilderApp
"
```

#### Creating a native executable

You can create a native executable using GraalVM:

```shell script
mvn -Pnative -Dagent=true -DskipTests=true -DskipNativeBuild=true package exec:exec@java-agent
```

# ------------------------------------------

### License:
MIT: [http://z4dev.mit-license.org](http://z4dev.mit-license.org)
