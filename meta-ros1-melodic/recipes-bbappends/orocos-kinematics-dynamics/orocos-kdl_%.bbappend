# Copyright (c) 2019 LG Electronics, Inc.

inherit ros_insane_dev_so


FILES_${PN}_prepend = " \
    ${datadir}/${ROS_BPN}/package.xml \
"

# The cmake files aren't in their own "cmake" subdirectory.
FILES_${PN}-dev_prepend = " \
    ${datadir}/${ROS_BPN}/*.cmake \
"
