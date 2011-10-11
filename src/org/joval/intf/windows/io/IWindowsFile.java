// Copyright (C) 2011 jOVAL.org.  All rights reserved.
// This software is licensed under the AGPL 3.0 license available at http://www.joval.org/agpl_v3.txt

package org.joval.intf.windows.io;

import java.io.IOException;

import org.joval.intf.windows.identity.IACE;
import org.joval.intf.io.IFile;

/**
 * Defines extended attributes of a file on Windows.
 *
 * @author David A. Solin
 * @version %I% %G%
 */
public interface IWindowsFile extends IFile {
    /**
     * Either the type of the specified file is unknown, or the function failed.
     */
    int FILE_TYPE_UNKNOWN = 0x0000;

    /**
     * The specified file is a disk file.
     */
    int FILE_TYPE_DISK = 0x0001;

    /**
     * The specified file is a character file, typically an LPT device or a console.
     */
    int FILE_TYPE_CHAR = 0x0002;

    /**
     * The specified file is a socket, a named pipe, or an anonymous pipe.
     */
    int FILE_TYPE_PIPE = 0x0003;

    /**
     * Unused.
     */
    int FILE_TYPE_REMOTE = 0x8000;

    /**
     * Returns one of the FILE_TYPE_ constants.
     */
    public int getWindowsFileType() throws IOException;

    public IACE[] getSecurity() throws IOException;
}
