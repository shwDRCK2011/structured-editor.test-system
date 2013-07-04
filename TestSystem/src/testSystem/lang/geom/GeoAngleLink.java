package testSystem.lang.geom;

import geogebra.kernel.GeoAngle;
import geogebra.main.Application;
import ru.ipo.structurededitor.model.Cell;
import ru.ipo.structurededitor.model.DSLBeanParams;
import ru.ipo.structurededitor.model.FieldCell;

/**
 * Created by IntelliJ IDEA.
 * User: oleg
 * Date: 18.03.11
 * Time: 14:18
 */
@DSLBeanParams(shortcut = "∠ чертеж", description = "Угол с чертежа")
public class GeoAngleLink extends AbstractGeoAngle {

    public GeoAngle getGeo() {
        return geo;
    }

    public void setGeo(GeoAngle geo) {
        this.geo = geo;
    }

    private GeoAngle geo;

    @Override
    public GeoAngle resolve(Application app) {
        return geo;
    }

    public Cell getLayout() {
        return new FieldCell("geo");
    }
    public String toString() {
        return " ∠"+geo.getCaption()+" ";
    }
}
