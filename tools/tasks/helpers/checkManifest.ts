import { modpackManifest } from "#globals";
import { fetchFileInfo } from "#utils/curseForgeAPI.ts";
import fs from "fs";
import buildConfig from "#buildConfig";
import { buildModList } from "#tasks/misc/createModList.ts";

export function checkManifestStructure(throwErrors: boolean) {
	return void throwErrors;
}

export async function checkManifestFilesExist() {
	// Check if the file exists to the given project id (will throw if invalid)
	await Promise.all(
		modpackManifest.files.map((file) =>
			fetchFileInfo(file.projectID, file.fileID),
		),
	);

	// Write a modlist
	if (!fs.existsSync(buildConfig.buildDestinationDirectory)) {
		await fs.promises.mkdir(buildConfig.buildDestinationDirectory, {
			recursive: true,
		});
	}

	return buildModList(buildConfig.buildDestinationDirectory);
}
