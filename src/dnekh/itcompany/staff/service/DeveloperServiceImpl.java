package dnekh.itcompany.staff.service;

import dnekh.itcompany.staff.service.interfaces.DeveloperService;

public class DeveloperServiceImpl implements DeveloperService {

    @Override
    public void toWork() {
        System.out.println("Developer starts to work");
    }

    @Override
    public void toCode() {
        System.out.println("Developer is coding now!");
    }

    @Override
    public boolean isCodeWritten() {
        return false;
    }
}
