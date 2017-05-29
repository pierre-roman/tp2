package fr.univ_amu.iut.exercice3;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import java.util.concurrent.TimeoutException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class TestMyUndecoratedJavaFXWindow extends ApplicationTest {


    @Test
    public void should_initialize_stage_is_not_showing() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().isShowing()).isFalse();
        } catch (TimeoutException e) {
            fail();
        }
    }


    @Test
    public void should_initialize_stage_with_correct_title() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getTitle()).isEqualTo("Undecorated Useless JavaFX Window");
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Test
    public void should_initialize_stage_is_always_on_top() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().alwaysOnTopProperty().get()).isTrue();
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Test
    public void should_initialize_stage_is_not_resizable() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().resizableProperty().get()).isFalse();
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Test
    public void should_initialize_stage_with_height_of_400() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getHeight()).isEqualTo(400);
        } catch (TimeoutException e) {
            fail();
        }
    }


    @Test
    public void should_initialize_stage_with_width_of_800() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getWidth()).isEqualTo(800);
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Test
    public void should_initialize_stage_is_undecorated() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getStyle()).isEqualTo(StageStyle.UNDECORATED);
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        new MyUndecoratedJavaFXWindow().start(stage);
    }

}