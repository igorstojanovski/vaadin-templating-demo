package co.igorski.ui.views;

import co.igorski.ui.model.MainPanelModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import java.util.Optional;

@Tag("main-panel")
@HtmlImport("src/main-panel.html")
@StyleSheet("styles.css")

@Route("")
@Viewport("width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes")
@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainPanel extends PolymerTemplate<MainPanelModel> implements RouterLayout {

    private static final String EMPTY_NAME_GREETING = "Please enter your name";

    @EventHandler
    private void sayHello() {
        getModel().setGreeting(Optional.ofNullable(getModel().getUserInput())
                .filter(userInput -> !userInput.isEmpty())
                .map(greeting -> String.format("Hello %s!", greeting))
                .orElse(EMPTY_NAME_GREETING));
    }

}
