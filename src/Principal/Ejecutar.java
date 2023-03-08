package Principal;

import Registrar.metodosParaRegistrar;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;

/**
 *
 * @author elnoe
 */
public class Ejecutar {

    public static void main(String[] args) {
        FlatMaterialDeepOceanIJTheme.setup();
        Principal a = new Principal();
        a.setVisible(true);
    }

}
