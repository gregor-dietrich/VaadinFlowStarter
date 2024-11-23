package com.example.my_project.my_package.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.Span;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Route("")
public class MyUI extends VerticalLayout {
    private static final Logger logger = LoggerFactory.getLogger(MyUI.class);

    public MyUI() {
        Span label = new Span("Hello, World!");
        Button button = new Button("Click me", event -> {
            label.setText("Hello, Vaadin!");
            logger.debug("Button was clicked!");
        });
        add(label, button);

        logger.trace("MyUI initialized");
    }
}