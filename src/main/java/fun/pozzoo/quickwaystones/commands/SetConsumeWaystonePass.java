package fun.pozzoo.quickwaystones.commands;

import fun.pozzoo.quickwaystones.QuickWaystones;
import org.bukkit.command.CommandSender;

public class SetConsumeWaystonePass implements SubCommand {

    private final QuickWaystones plugin;

    public SetConsumeWaystonePass(QuickWaystones plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getName() {
        return "setConsumeWaystonePass";
    }

    @Override
    public String getDescription() {
        return "Enable or disable consuming waystone pass on use";
    }

    @Override
    public String getUsage() {
        return "/quickWaystones setConsumeWaystonePass <true|false>";
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (args.length != 2) {
            sender.sendMessage("§cUsage: " + getUsage());
            return;
        }

        boolean enabled;
        if (args[1].equalsIgnoreCase("true")) {
            enabled = true;
        } else if (args[1].equalsIgnoreCase("false")) {
            enabled = false;
        } else {
            sender.sendMessage("§cValue must be true or false.");
            return;
        }

        plugin.getConfig().set("Settings.ConsumeWaystonePass", enabled);
        plugin.saveConfig();

        sender.sendMessage("§aConsume waystone pass set to §e" + enabled);
    }
}
