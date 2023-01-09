package ru_synergy.anonimous;

public class GeneralIndicatorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("General monitoring started.");
    }
}

