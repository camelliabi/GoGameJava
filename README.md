# Go Game in Java

This is a simple Java GUI application that allows users to draw a Go board and place black and white stones alternately by clicking on the board using ESC100.

## Features

- User can specify the number of grid lines for the board (e.g. 9, 13, 19)
- Allows placing black and white stones alternately by mouse clicks
- Visual representation implemented using ECS100 library

## Limitations

- Does not check if a position is already occupied (stones can overwrite each other)
- No rules implemented for capturing stones
- No victory or territory calculation
- No undo functionality

## How to Run

1. Open the project in Eclipse or any Java IDE
2. Make sure the ECS100 library is included in your project’s build path
3. Run `Startup.java`
4. Click **Start Go Game** to draw the board
5. Enter the number of grid lines you want for the board
6. Click on the board to place stones

## Technologies Used

- Java
- ECS100 library for graphics and GUI buttons
- Mouse event handling
