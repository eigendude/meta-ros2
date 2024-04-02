# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Messages for calibrating a robot"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/robot_calibration_msgs"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "robot_calibration"
ROS_BPN = "robot_calibration_msgs"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    builtin-interfaces \
    rosidl-default-generators \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    builtin-interfaces \
    rosidl-default-generators \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    builtin-interfaces \
    rosidl-default-generators \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/robot_calibration-release/archive/release/rolling/robot_calibration_msgs/0.8.1-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/robot_calibration_msgs"
SRC_URI = "git://github.com/ros2-gbp/robot_calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "e5bae81ffd72e8a153fd9bc8c0a9d74a8ce71999"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
