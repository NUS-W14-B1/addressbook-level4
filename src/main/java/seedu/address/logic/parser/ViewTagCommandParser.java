package seedu.address.logic.parser;


import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.ViewTagCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.PersonContainsTagPredicate;

/**
 * Parses input arguments and creates a new ViewCommand object
 */
public class ViewTagCommandParser implements Parser<ViewTagCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FindCommand
     * and returns an FindCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public ViewTagCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ViewTagCommand.MESSAGE_USAGE));
        }

        String[] tagKeyword = trimmedArgs.split("\\s+");

        return new ViewTagCommand(new PersonContainsTagPredicate(tagKeyword[0]));
    }



}