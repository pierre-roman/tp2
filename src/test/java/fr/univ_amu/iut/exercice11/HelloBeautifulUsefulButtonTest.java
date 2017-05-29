package fr.univ_amu.iut.exercice11;

import fr.univ_amu.iut.exercice10.HelloBeautifulUsefulButton;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import java.io.PrintStream;
import java.util.concurrent.TimeoutException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.util.NodeQueryUtils.hasText;


public class HelloBeautifulUsefulButtonTest extends ApplicationTest {

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
    public void should_initialize_stage_with_height_of_250() {
        try {
            assertThat(FxToolkit.registerPrimaryStage().getHeight()).isEqualTo(250);
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
    public void should_initialize_stage_with_a_graphic() {
        verifyThat("#buttonHello", (Button node) -> node.getGraphic() instanceof ImageView);
        verifyThat("#buttonHello", (Button node) -> ((ImageView) node.getGraphic()).getImage() != null);
        verifyThat("#buttonHello", (Button node) -> ((ImageView) node.getGraphic()).getImage().getHeight() == 150);
        verifyThat("#buttonHello", (Button node) -> ((ImageView) node.getGraphic()).getImage().getWidth() == 150);
    }

    @Ignore
    @Test
    public void should_button_click_show_useless_text() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        // when:
        clickOn("#buttonHello");

        // then:
        verify(out).println("Bouton actionné 1 fois");
    }

    @Ignore
    @Test
    public void should_button_multiple_click_show_useless_text() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        // when:
        clickOn("#buttonHello");
        clickOn("#buttonHello");
        clickOn("#buttonHello");

        // then:
        verify(out).println("Bouton actionné 3 fois");
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

    @Override
    public void start(Stage stage) throws Exception {
        new HelloBeautifulUsefulButton().start(stage);
    }
}