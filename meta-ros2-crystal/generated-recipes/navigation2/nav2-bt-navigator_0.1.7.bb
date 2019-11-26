# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_crystal
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Michael Jeronimo <michael.jeronimo@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "navigation2"
ROS_BPN = "nav2_bt_navigator"

ROS_BUILD_DEPENDS = " \
    behaviortree-cpp \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    nav2-robot \
    nav2-tasks \
    rclcpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    behaviortree-cpp \
    nav-msgs \
    nav2-msgs \
    nav2-tasks \
    rclcpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_bt_navigator/0.1.7-0.tar.gz
ROS_BRANCH ?= "branch=release/crystal/nav2_bt_navigator"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "efe921aa3bb5c5e8a4dc25c3c56e5070d694e8b6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
