package co.igorski.ui.views;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "sub", layout = MainPanel.class)
public class SubView extends VerticalLayout {

    public SubView() {
        add(new Label("Sub View"));
    }


}
