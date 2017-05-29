package fr.univ_amu.iut.exercice5;

import javafx.stage.Stage;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WhoIsWhoTest extends ApplicationTest {
    private PrintStream out = mock(PrintStream.class);

    @BeforeClass
    public static void setUp() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(WhoIsWho.class);
    }

    @Ignore
    @Test
    public void test_life_cycle_output() {
        verify(out).println("[JavaFX Application Thread] constructeur ApplicationLifeCycle()");
        verify(out).println("[JavaFX Application Thread] start()");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.setOut(out);
        new WhoIsWho().start(stage);
    }

}
