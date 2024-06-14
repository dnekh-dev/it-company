package dnekh.itcompany.service;

import dnekh.itcompany.service.interfaces.ManagerService;

public class ManagerServiceImpl implements ManagerService {

    @Override
    public void toWork() {
        System.out.println("Manager starts to work");
    }

    @Override
    public void doBriefing() {
        System.out.println("Manager conduct briefing");
    }

    @Override
    public void manageTeam() {
        System.out.println("Manager rules the team");
    }
}
