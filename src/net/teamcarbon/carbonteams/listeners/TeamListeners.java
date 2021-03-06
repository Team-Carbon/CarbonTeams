package net.teamcarbon.carbonteams.listeners;

import net.teamcarbon.carbonteams.CarbonTeams;
import net.teamcarbon.carbonteams.events.*;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

// All these events can be used to extend Teams with another plugin later
// by listening to events called by Teams. This class is just logging debug
// info about the events if debug-logging is enabled in config.

@SuppressWarnings("UnusedDeclaration")
public class TeamListeners implements Listener {
	@EventHandler()
	public void teamCreate(TeamCreateEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamDelete(TeamDeleteEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamJoin(TeamJoinEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamLeave(TeamLeaveEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamSetHome(TeamSetHomeEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamSetBanner(TeamSetBannerEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamGoHome(TeamTeleportHomeEvent e) { debugHandle(e); }

	@EventHandler()
	public void teamGetBanner(TeamGetBannerEvent e) { debugHandle(e); }

	// Simple method to print out event information as they're called into as a debug log
	private void debugHandle(Cancellable e) { CarbonTeams.log.debug(e.getClass().getName() + " - Cancelled: " + e.isCancelled()); }
}
