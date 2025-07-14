import ecs100.*;

public class Startup {

	public static void main(String[] args) {
		UI.initialise();
		GoGame GoGame = new GoGame();
        UI.addButton("Start Go Game", GoGame::drawGridBoard);
		UI.addButton("Clear", UI::clearPanes );
		UI.addButton("Quit", UI::quit );
	}
}
