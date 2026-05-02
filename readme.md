# QuickWaystones v2.1.0
QuickWaystones is a Minecraft plugin that brings the convenience of instant travel to your worlds with the introduction of waystones. Seamlessly teleport between locations and enhance your gameplay experience.

## Changes Over Original
- **More Saving:** Saves data when discovering waystones, renaming waystones, and using waystone passes (in addition to the existing saves on creation/removal).
- **Bigger Menus:** Instead of a single chest, it now uses a double chest so you can see more per page (45 items vs 27).
- **UUIDs for IDs:** Allows multiple waystones to have the same name and not override each other.
- **World Specific Icons:** The 3 dimensions in Minecraft have their own block as the icon in the menu (Grass Block, Netherrack, End Stone).
- **Alphabetical Sorting:** Waystones are now sorted alphabetically by name in the GUI.
- **Consumable Passes:** Optional setting to remove waystone passes after use (`/quickwaystones setConsumeWaystonePass <true|false>`).

## Features
### 🚩 **Place and Use Waystones**
- Craft lodestones and turn them into waystones by interacting.
- Interact with a waystone to instantly teleport to any other waystone you've discovered.
- Want to share a waystone with a friend? Simply right-click on it with paper to create a "waystone pass". Friends can use the pass to discover and access the waystone!
- Rename your waystones with a name tag to keep them organized!
- Set the teleport cost with `/quickwaystones setXpCost <amount>`! (or disable it by setting to 0)
- New recipe for lodestones:
  
     ![image](https://github.com/Pozzoo/QuickWaystones/assets/73541474/003effe1-ae79-4061-89d9-90a1d5fcb4a6)

### ⚙️ **Customizable Settings**
- Toggle the use of waystone passes to suit your server’s needs.
- Enable or disable global waystone access with a simple setting.
- Use the in-game command `/quickwaystones` to adjust settings on the fly without restarting the server.

## Contribution
We welcome all kinds of contributions! Open feature requests, report issues, or submit pull requests to help improve QuickWaystones.

## Thanks To
### Contributors
- [m1kau](https://github.com/m1kau) — for the XP cost feature

## License
QuickWaystones is open-source and licensed under the GNU GPL v3 License. For more details, refer to the [LICENSE](https://github.com/Pozzoo/QuickWaystones/blob/main/LICENSE) file.

## Support
If you have questions, feedback, or need support, join the conversation on our [GitHub Discussions](https://github.com/Pozzoo/QuickWaystones/discussions).
