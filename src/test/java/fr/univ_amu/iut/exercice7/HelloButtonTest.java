package fr.univ_amu.iut.exercice7;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import java.util.concurrent.TimeoutException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.util.NodeQueryUtils.hasText;


public class HelloButtonTest extends ApplicationTest {

    @Ignore
    @Test
    public void should_initialize_stage_with_correct_title() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getTitle()).isEqualTo("Hello !");
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Ignore
    @Test
    public void should_initialize_stage_with_height_of_100() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getHeight()).isEqualTo(100);
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Ignore
    @Test
    public void should_initialize_stage_with_width_of_250() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getWidth()).isEqualTo(250);
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Ignore
    @Test
    public void should_initialize_button_with_text_hello() {
        // then:
        verifyThat("#buttonHello", hasText("Hello !"));
    }

    @Ignore
    @Test
    public void should_initialize_stage_is_showing() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().isShowing()).isTrue();
        } catch (TimeoutException e) {
            fail();
        }
    }

    @Ignore
    @Test
    public void should_initialize_stage_with_useless_button() {
        verifyThat("#buttonHello", (Button node) -> node.getOnAction() == null);
    }

    @Override
    public void start(Stage stage) throws Exception {
        new HelloButton().start(stage);
    }
}