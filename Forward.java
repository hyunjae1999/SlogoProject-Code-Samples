package model.command.turtle.command;

import model.Model;
import model.command.Command;

/**
 * A command that moves all active turtles forward the given number of pixels.
 *
 * @author Hyunjae Lee
 */
public class Forward extends Command {

    private static final int ARG_COUNT = 1;

    public Forward() {
        super();
        argCount = ARG_COUNT;
    }

    @Override
    public double execute(Model model) {
        double ret = 0;
        for(Command d : this.parameters) {
            final double pixels = d.execute(model);
            model.getTurtles().run( t -> t.moveAlongHeading(pixels));
            ret = pixels;
        }
        return ret;
    }
}
