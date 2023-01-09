package ru_synergy.anonimous;

public class SecurityMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Security monitoring started.");
    }
}
