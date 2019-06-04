package Builder9;

public class CommonRoleBuilder extends Builder {

    @Override
    public void buildHead() {
        this.role.setHead("公共头");
    }

    @Override
    public void buildFace() {
        role.setFace("公共脸");
    }

    @Override
    public void buildBody() {
        role.setBody("公共身体");
    }

    @Override
    public void buildHp() {
        role.setHp(1.1);
    }

    @Override
    public void buildSp() {
        role.setSp(1.1);
    }

    @Override
    public void buildMp() {
        role.setMp(2.2);
    }
}
