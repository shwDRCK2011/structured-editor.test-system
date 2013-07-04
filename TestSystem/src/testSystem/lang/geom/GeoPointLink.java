package testSystem.lang.geom;

import geogebra.kernel.GeoPoint;
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
@DSLBeanParams(shortcut = ". чертеж", description = "Точка с чертежа")
public class GeoPointLink extends AbstractGeoPoint {
    public GeoPoint getGeo() {
        return geo;
    }

    public void setGeo(GeoPoint geo) {
        this.geo = geo;
    }

    private GeoPoint geo;

    @Override
    public GeoPoint resolve(Application app) {
        return geo;
    }

    public Cell getLayout() {
        return new FieldCell("geo");
    }
    public String toString() {
          return " ."+geo.getCaption()+" ";
    }
}

