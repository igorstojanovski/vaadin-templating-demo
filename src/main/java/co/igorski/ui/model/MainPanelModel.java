package co.igorski.ui.model;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface MainPanelModel extends TemplateModel {
    /**
     * Gets user input from corresponding template page.
     *
     * @return user input string
     */
    String getUserInput();

    /**
     * Sets greeting that is displayed in corresponding template page.
     *
     * @param greeting
     *            greeting string
     */
    void setGreeting(String greeting);
}
