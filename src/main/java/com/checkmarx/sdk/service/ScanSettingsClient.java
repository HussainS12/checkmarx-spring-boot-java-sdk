package com.checkmarx.sdk.service;

import com.checkmarx.sdk.dto.cx.CxScanSettings;
import com.checkmarx.sdk.exception.CheckmarxException;
import java.util.List;

/**
 * Works with scan settings. The settings contain<br>
 * - engine configuration<br>
 * - scan presets
 */
public interface ScanSettingsClient {
    int createScanSettings(int projectId, int presetId, int engineConfigId, int postScanId,
                           List<String> afterScanEmail, List<String> beforeScanEmail,
                           List<String> failedScanEmail);

    String getScanSettings(int projectId);

    CxScanSettings getScanSettingsDto(int projectId);

    int getPresetId(String preset) throws CheckmarxException;

    String getPresetName(int presetId);

    int getProjectPresetId(int projectId);

    int getEngineConfigurationId(String configurationName) throws CheckmarxException;

    String getEngineConfigurationName(int configurationId);
}
