package com.mphasis.delivery.dashboard.base.ui.view;

import com.mphasis.delivery.dashboard.base.ui.component.MainLayout;
import com.mphasis.delivery.dashboard.base.ui.component.ViewToolbar;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "feedback", layout = MainLayout.class)
@PageTitle("Feedback")
@PermitAll
public class FeedbackView extends Main {
    public FeedbackView() {
        add(new ViewToolbar("Give Feedback"));
    }
}
