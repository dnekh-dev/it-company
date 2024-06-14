package dnekh.itcompany.service;

import dnekh.itcompany.service.interfaces.DesignerService;

public class DesignerServiceImpl implements DesignerService {

    @Override
    public void toWork() {
        System.out.println("Designer starts to work");
    }

    @Override
    public void makeDesign() {
        System.out.println("Designer is making a new concept");
    }

    @Override
    public void showDesign() {
        System.out.println("Designer is showing the result of his work");
    }
}
