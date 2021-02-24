package controllers;

import models.Station;
import play.Logger;
import play.mvc.Controller;

import java.util.List;

public class Dashboard extends Controller
{
  public static void index() {
    Logger.info("Rendering Dashboard");
    List<Station> stations = Station.findAll();
    Station station = stations.get(0);
    render ("dashboard.html", station);
  }
}
