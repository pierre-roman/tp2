package fr.univ_amu.iut.exercice4;

import fr.univ_amu.iut.exercice5.WhoIsWho;
import javafx.stage.Stage;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestApplicationLifeCycle extends ApplicationTest {

    private PrintStream out;

    @BeforeClass
    public static void setUpClass() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(WhoIsWho.class);
    }

    @Ignore
    @Test
    public void constructor() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        new ApplicationLifeCycle();
        verify(out).println("constructeur ApplicationLifeCycle()");
    }


    @Ignore
    @Test
    public void init() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        new ApplicationLifeCycle().init();
        verify(out).println("init()");
    }

    @Ignore
    @Test
    public void stop() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        new ApplicationLifeCycle().stop();
        verify(out).println("stop()");
    }

    @Ignore
    @Test
    public void test_life_cycle_output() {
        verify(out).println("constructeur ApplicationLifeCycle()");
        verify(out).println("start() : avant show stage");
        verify(out).println("start() : après show stage");
    }

    @Override
    public void start(Stage stage) throws Exception {
        out = mock(PrintStream.class);
        System.setOut(out);
        new ApplicationLifeCycle().start(stage);
    }


}