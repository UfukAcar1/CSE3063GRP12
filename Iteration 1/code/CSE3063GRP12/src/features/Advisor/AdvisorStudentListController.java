package features.Advisor;

import core.general_providers.TerminalManager;
import core.general_providers.SessionController;
import core.models.concretes.Advisor;
import core.repositories.UserRepository;
import features.main_menu.MenuController;

public class AdvisorStudentListController {
    private AdvisorStudentListView advisorStudentListView;
    private UserRepository userRepository;

    public AdvisorStudentListController() {
        advisorStudentListView = new AdvisorStudentListView();

        handleStudentList();
    }

    private void navigateToMenu() {
        new MenuController();
    }

    private String getUserInput() {
        String input = TerminalManager.getInstance().read();
        TerminalManager.getInstance().dispose();
        return input;
    }

    private void handleStudentList() {
        while (true) {
            System.out.println("Type \"q\" to see the menu\n Type \"Show\" to see the student list");
            String input = getUserInput();
            if (input.equals("q")) {
                navigateToMenu();
                break;
            } else if (input.equals("Show")) {
                Advisor a = (Advisor) SessionController.getInstance().getCurrentUser();
                advisorStudentListView.showStudentList(userRepository.getStudentsByAdvisor(a));
            }
        }
    }
}